Ext.define('AK.view.MainViewModel', {
    extend: 'Ext.app.ViewModel',
    requires: ['AK.model.Provider', 'AK.model.Product'],


    stores: {
        products: {
            model: 'AK.model.Product',
            autoLoad: true,
            autoSync: true,


        },
        providers: {
            model: 'AK.model.Provider',
            autoload: true,
            autoSync: true
        }


    }
})