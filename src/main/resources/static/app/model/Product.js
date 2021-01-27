Ext.define("AK.model.Product", {
    extend: 'Ext.data.Model',
    fields: ['productName', 'id', 'store', 'brand', 'model', 'quantity', 'price', 'pricePerProduct'],
    proxy: {
        url: '/products',
        type: 'rest',
        writer: {
            writeRecordId: false,
            writeAllFields: true
        }
    }

})