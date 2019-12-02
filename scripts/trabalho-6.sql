CREATE FUNCTION p_albuns_por_compositor(@nome VARCHAR(50))
RETURNS @saida TABLE(id_album INT, descricao VARCHAR(50), tipo_compra VARCHAR(50), data_gravacao DATE, 
data_compra DATE, preco_compra DECIMAL(10,2), cod_gravadora INT)
AS
BEGIN
INSERT INTO @saida 
SELECT a.id, a.descricao, a.tipo_compra, a.dt_gravacao, a.dt_compra, a.preco_compra, a.cod_gravadora
FROM compositor c , faixa_compositor fc , faixa f , album a
WHERE c.id_compositor = fc.id_compositor AND fc.id_album = a.id AND c.nome like '%' + @nome + '%'
GROUP BY a.id, a.descricao, a.tipo_compra, a.dt_gravacao, a.dt_compra, a.preco_compra, a.cod_gravadora
RETURN
END
