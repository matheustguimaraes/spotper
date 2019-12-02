CREATE VIEW v_musicas_dvorak AS
SELECT cf.num_faixa AS 'num_faixa', cf.id_album AS 'id_album'
FROM compositor c, faixa_compositor cf
WHERE c.id_compositor = cf.id_compositor AND c.nome LIKE '%Dvorak%'

SELECT g.nome, COUNT(fp.id_album)
FROM gravadora g INNER JOIN album a INNER JOIN faixa_playlist fp INNER JOIN v_musicas_dvorak md
ON md.num_faixa = fp.num_faixa ON fp.id_album = a.id ON a.cod_gravadora = g.cod
GROUP BY g.nome
