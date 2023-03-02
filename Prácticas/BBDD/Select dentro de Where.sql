/*SELECT c.codigo_cliente, c.nombre_cliente, p.codigo_pedido 
FROM cliente c 
	LEFT JOIN pedido p ON p.codigo_cliente = c.codigo_cliente
WHERE p.codigo_pedido IS NULL*/
    /*Join sin punto comñun*/
/*SELECT p.codigo_pedido, MAX(p.fecha_pedido) FROM pedido p 
	GROUP BY YEAR (p.fecha_pedido);*/
    
SELECT p.codigo_pedido, MAX(p.fecha_pedido) FROM pedido p
WHERE p.fecha_pedido IN (
	SELECT p.codigo_pedido, (p.fecha_pedido) FROM pedido p 
	GROUP BY YEAR (p.fecha_pedido)
    );
    