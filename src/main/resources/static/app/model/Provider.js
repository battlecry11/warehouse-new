Ext.define("AK.model.Provider", {
    extend: 'Ext.data.Model',
    fields: ['id','providerName'],
    proxy: {
        url: '/providers',
        type: 'rest',
        writer: {
            writeRecordId: false,
            writeAllFields: true
        }
    }

})