SELECT *
FROM album a
WHERE preco_compra > (SELECT AVG(preco_compra) FROM album)