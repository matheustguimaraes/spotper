SELECT c.nome, COUNT(*) 
FROM compositor c INNER JOIN faixa_compositor cf INNER JOIN faixa_playlist fp
ON fp.id_album = cf.id_album ON cf.id_compositor = c.id_compositor
GROUP BY c.nome