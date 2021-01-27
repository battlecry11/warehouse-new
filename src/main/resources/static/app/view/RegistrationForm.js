Ext.define('AK.view.RegistrationForm', {
    extend: 'Ext.panel.Panel',
    //  layout: {
    //     type: 'vbox',
    // //     //  align: 'stretch'
    //  },
    viewModel:{
        xclass: 'AK.view.MainViewModel'
    },
    controller:{
        xclass: 'AK.view.MainController'
    },
    items: [{
        xtype: 'form',
        reference: 'form',
        layout: {
            type: 'hbox',
        },
        defaultType: 'fieldset',
        fieldDefaults: {
            labelAlign: 'top',
            anchor: '100%'
        },
        items: [{
            defaultType: 'combo',

            items: [{
                name: 'provider',
                fieldLabel: 'მიმწოდებელი',
                store: {
                    bind: '{providers}'

                },
                queryMode: 'local',
                displayField: 'providerName',
                valueField: 'id',
            }, {
                name: 'store',
                fieldLabel: 'საწყობი',
            }]

        }, {

            defaultType: 'textfield',
            items: [{
                name: 'brand',
                fieldLabel: 'მოდელი',
                allowBlank: false,
            }, {
                name: 'model',
                fieldLabel: 'ბრენდი',
                allowBlank: false,
            }]
        }, {
            defaultType: 'textfield',
            items: [{
                name: 'quantity',
                fieldLabel: 'რაოდენობა',
                allowBlank: false,
            }, {
                name: 'price',
                fieldLabel: 'ღირებულება',
                allowBlank: false,

            }]
        }, {
            layout: 'vbox',
            items: [{
                margin: '20 0 0 0',
                xtype: 'button',
                text: 'შენახვა',
                 handler: 'save'
            }, {
                xtype: 'button',
                margin: '20 0 0 0',
                text: 'გასუფთავება',

            }]
        }]
    }]

    })
