
package clase06_JDBC_MySQL;

public class Teoria {
    
}

/*
                                            Base de Datos
DML
    DML significa Data Manipulation Language o Lenguaje de Manipulación de Datos, y corresponde 
    las sentencias del SQL que se utilizan para manejar los datos de la base de datos
    (select, insert, update, delete, etc).
DDL
    El lenguaje de Definición de datos, en inglés Data Definition Language (DDL), es el que se encarga
    de la modificación de la estructura de los objetos de la base de datos. Algunas de sus
    operaciones básicas son: CREATE, ALTER y DROP.

                                                JDBC
ORM -> Hibernate,TopLink sirven para hacer el mapeo entre una base de datos y objetos.
Es agnostico a la bd, el codigo sirve igual para todas las bd.
Se agrega el driver JDBC de cada base de datos (relaciona,no relacional, etc)

Indice, lo que me permite buscar buscar dentro de la tabla. Se asocia con la Primary Key

                                            Comandos SQL:

SELECT * FROM employees;

SELECT emp_no, first_name FROM employees;

SELECT * FROM employees WHERE emp_no <=10008;

SELECT * FROM employees WHERE last_name = 'erde';

SELECT * FROM employees WHERE gender = 'F';

SELECT * FROM employees WHERE last_name LIKE '%o%';  like busca algo dentro de los campos ,el % significa cualquier cosa adelante y cualquier cosa atras de o

SELECT * FROM employees where emp_no > 10100 and emp_no < 10150;

SELECT * FROM employees order by first_name;    order by me va a ordenar por first_name

SELECT * FROM employees order by first_name desc;     el desc me lo va a ordenar por descendente

INSERT into employees (emp_no, birth_date,first_name,last_name,gender,hire_date) VALUES (-90001,'1984-4-5','Mauro','palo','M','2017-5-4');

INSERT into employees VALUES (-90001,'1984-4-5','Mauro','palo','M','2017-5-4');

DELETE FROM employees WHERE emp_no > 1;

UPDATE employees SET birth_date = '1950-01-01', first_name= 'Hugo', last_name = 'Chavez', gender = 'M',hire_date = '1970-4-5' WHERE emp_no = -90001;




*/