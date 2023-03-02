/*SELECT AVG(saldo), marca FROM usuarios GROUP BY marca*/
/*SELECT AVG(saldo), COUNT(id),compañia FROM usuarios WHERE compañia <> "NEXTEL" GROUP BY compañia*/
/*SELECT AVG(saldo), COUNT(id),compañia FROM usuarios GROUP BY compañia HAVING compañia <> "NEXTEL"*/
/*SELECT count(id), SUM(saldo), marca, compañia FROM usuarios GROUP BY compañia, marca*/
SELECT count(id) AS "Nro de clientes",SUM(saldo) AS saldo, marca, compañia FROM usuarios GROUP BY compañia, marca