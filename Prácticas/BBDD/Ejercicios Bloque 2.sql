/*1*/
/*SELECT c.nombre_cliente, e.nombre, e.apellido1 FROM cliente c 
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado;*/

/*2*/
/*SELECT DISTINCT c.nombre_cliente, e.nombre FROM cliente c 
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
		JOIN pago p ON c.codigo_cliente = p.codigo_cliente;*/
        
/*3*/
/*SELECT DISTINCT c.nombre_cliente, e.nombre FROM cliente c 
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
		LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
	WHERE p.codigo_cliente IS NULL;*/
    
/*4*/
/*SELECT DISTINCT c.nombre_cliente, e.nombre, ofi.ciudad FROM cliente c 
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
		JOIN pago p ON c.codigo_cliente = p.codigo_cliente
			JOIN oficina ofi ON ofi.codigo_oficina = e.codigo_oficina;*/
            
/*5*/
/*SELECT DISTINCT c.nombre_cliente, e.nombre, ofi.ciudad FROM cliente c 
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
		LEFT JOIN pago p ON c.codigo_cliente = p.codigo_cliente
			JOIN oficina ofi ON ofi.codigo_oficina = e.codigo_oficina
	WHERE p.codigo_cliente IS NULL;*/
    
/*6*/
/*SELECT ofi.linea_direccion1, ofi.linea_direccion2 FROM cliente c 
	JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado		
		JOIN oficina ofi ON ofi.codigo_oficina = e.codigo_oficina
WHERE c.ciudad = "Fuenlabrada";*/

/*7*/
/*SELECT c.nombre_cliente, e.nombre, ofi.ciudad FROM cliente c
JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado
		JOIN oficina ofi ON ofi.codigo_oficina = e.codigo_oficina;*/
        
/*8*/
/*SELECT e.nombre AS Nombre_empleado, em.nombre AS Nombre_jefe FROM empleado e 
	JOIN empleado em ON e.codigo_jefe = em.codigo_empleado;*/
    
/*9*/
/*SELECT e.nombre AS Nombre_empleado, em.nombre AS Nombre_jefe, emp.nombre AS Nombre_jefe_del_jefe FROM empleado e 
	JOIN empleado em ON e.codigo_jefe = em.codigo_empleado
		JOIN empleado emp ON em.codigo_jefe = emp.codigo_empleado;*/
        
/*10*/
/*SELECT DISTINCT c.nombre_cliente FROM cliente c 
	JOIN pedido p ON c.codigo_cliente = p.codigo_cliente
		JOIN pedido pe ON pe.estado = "Entregado"
WHERE p.fecha_entrega = p.fecha_esperada IS NULL;*/

/*11*/

