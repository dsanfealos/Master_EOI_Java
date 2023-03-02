/*SELECT c.codigo_cliente, c.nombre_cliente, p.fecha_pago FROM cliente c
	LEFT JOIN pago p ON p.codigo_cliente = c.codigo_cliente
    LEFT JOIN pedido pe ON pe.codigo_cliente = p.codigo_cliente 
WHERE p.codigo_cliente IS NULL AND pe.codigo_cliente IS NULL*/

/*Ej 4*/
/*SELECT emp.codigo_empleado, emp.nombre FROM empleado emp
	WHERE emp.codigo_oficina IS NULL;*/

/*Ej 5*/
/*SELECT emp.codigo_empleado, emp.nombre, cli.codigo_cliente FROM empleado emp
	LEFT JOIN cliente cli ON cli.codigo_empleado_rep_ventas = emp.codigo_empleado 
WHERE cli.codigo_empleado_rep_ventas IS NULL;*/

/*ej 6*/


/*ej 7*/

/*Copiar el 5*/

/*EJ 8*/
SELECT p.codigo_producto,p.nombre,d.codigo_producto,d.codigo_pedido FROM producto p 

	LEFT JOIN detalle_pedido d ON p.codigo_producto=d.codigo_producto

WHERE d.codigo_producto IS NULL;

/*Ej 10*/
SELECT e.codigo_empleado, o.codigo_oficina FROM empleado e 
	JOIN oficina o ON e.codigo_oficina = o.codigo_oficina
WHERE e.codigo_empleado NOT IN (5,8,9,11,12,18,19);	/*Revisar codigo María*/