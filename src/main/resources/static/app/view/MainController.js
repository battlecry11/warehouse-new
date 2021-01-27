Ext.define('AK.view.MainController', {
    extend: 'Ext.app.ViewController',
    save: function () {
        const form = this.lookup('form');
        const values = form.getForm().getValues();
        const store = this.getViewModel().getStore('products');
        const product= Ext.create('AK.model.Product', values);
        store.add(product);
        form.reset();

    }

})