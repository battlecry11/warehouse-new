Ext.define('AK.view.Grid', {
    extend: 'Ext.grid.Panel',
    viewModel:{
        xclass: 'AK.view.MainViewModel'
    },
    controller:{
        xclass: 'AK.view.MainController'
    },
    bind: {
        store: '{products}',
    },
    columns: [{
        text: 'მომწოდებელი',
        dataIndex: 'provider',
        flex: 1,
    }, {
        text: 'საწყობი',
        dataIndex: 'store',
        flex: 1,
    }, {
        text: 'ბრენდი',
        dataIndex: 'brand',
        flex: 1
    }, {
        text: 'მოდელი',
        dataIndex: 'model',
        flex: 1
    }, {
        text: 'რაოდენობა',
        dataIndex: 'quantity',
        flex: 1,

    }, {
        text: 'საცალო ფასი',
        dataIndex: 'pricePerProduct',
        flex: 1,
    }, {
        text: 'თარიღი',
        dataIndex: 'publishDate',
        flex: 1,

       // renderer: Ext.util.Format.dateRenderer('d.m.Y H:i:s')
    }, {
        //flex: 1
    }]

})