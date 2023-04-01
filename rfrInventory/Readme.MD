
Servicio de devolución de inventario.

Peticion

POST http://localhost:8080/inventory


{
"operation":"inventory",
"engine": "SCM",
"assetClass":"EQ",
"factorType":"DIV",
"unit":"ES"
}

Response

[
{
"headerCtrl": {},
"rfInfo": {
"assetClass": "EQ",
"factorType": "DIV",
"engine": "SCM"
},
"rfBody": {}
}
]