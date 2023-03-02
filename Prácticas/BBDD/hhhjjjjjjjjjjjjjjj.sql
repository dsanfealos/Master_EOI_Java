/*SELECT ofi.codigo_oficina, ofi.ciudad, emp.codigo_empleado, emp.nombre, emp.apellido1, emp.apellido2 FROM oficina ofi 
	JOIN empleado emp ON ofi.codigo_oficina = emp.codigo_oficina*/
    
/*Obtener una lista de los pedidos de cada cliente mostrando el código del cliente, su nombre y el número de pedido*/

SELECT cli.codigo_cliente, cli.nombre_cliente, ped.codigo_pedido 
  FROM pedido ped
		JOIN cliente cli ON cli.codigo_cliente = ped.codigo_cliente;