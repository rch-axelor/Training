CREATE TABLE unit (
unit_id SERIAL PRIMARY KEY,
unit_name VARCHAR(50) UNIQUE);

CREATE TABLE productcategory (
product_categoryid SERIAL PRIMARY KEY,
product_categoryname VARCHAR(50) NOT NULL);



CREATE TABLE product (
product_id SERIAL PRIMARY KEY,
product_name VARCHAR(50),
unit_id INT,
unit_price INT,
product_categoryid INT(50),
FOREIGN KEY (unit_id) REFERENCES unit (unit_id),
FOREIGN KEY (product_categoryid) REFERENCES productcategory (product_categoryid) ;

CREATE TABLE saleorderline (
sale_orderline_id SERIAL PRIMARY KEY,
product_id INT,
sale_price INT,
FOREIGN KEY (product_id) REFERENCES product (product_id);


/* Add column name "code" */
ALTER TABLE productcategory
ADD code VARCHAR(100);


/* Add constraint UNIQUE to code field */
ALTER TABLE productcategory
ADD CONSTRAINT code_unique UNIQUE (code);

INSERT INTO unit (unit_name)
VALUES ('abc'), ('lmn'), ('opq'), ('xyz');


INSERT INTO productcategory (product_categoryname)
VALUES ('MALE'), ('FEMALE'), ('KIDS');

INSERT INTO product (product_name, unit_id, unit_price, product_categoryid)
VALUES ('M_SHIRT',2,500,1), ('M_DENNIUM',2, 400,1), ('M_T-SHIRT', 2, 200,1), ('F_T-SHIRT', 1, 300,2), ('F_SHIRT', 1, 100,2), ('F_DENNIUM', 1, 500,2), ('JEANS', 4, 600,2 ), ('K_SHORTS', 3, 100,3), ('F_SKIRTS', 1, 200,2), ('K_SKIRT', 3, 100,3), ('K_SHIRT', 3, 100,3), ('K_JEANS', 3, 100,3);


INSERT INTO saleorderline (product_id, sale_price)
VALUES (1, 2000), (2, 1000), (3, 4300), (4, 2500), (5, 3000), (6, 1800), (7, 1600), (8, 3200), (9, 2400), (10, 2200), (11, 3650), (12, 5000);

Insert into product (unit_id, unit_price, product_categoryid) VALUES (2, 300, 3);



/*
1. List out all the Product details with Unit name and Product category name.  (If unit or product_category is null then also that product should be in the listing)
Output : 
Product Name | Unit | Product Category | Price */

SELECT p.product_name, pc.product_categoryname, u.unit_name, p.unit_price, s.sale_price from product p, productcategory pc , unit u, saleorderline s where p.unit_id = u.unit_id and p.product_categoryid = pc.product_categoryid and p.product_id = s.product_id;


/*
2. Fetch product category code whose sale is max.  
Output  : 
Product Category Code | Max Qty Sold
*/
			

SELECT MAX(s.sale_price), pc.code  
FROM saleorderline s, product p,  productcategory pc
WHERE pc.product_categoryid = p.product_categoryid
AND p.product_id = s.product_id
group by pc.code
order by pc.code desc
limit 1;

				

/*
3. List out Product Categories in which there is no product available. 
Output : 
Product Category Name
*/

SELECT product_categoryid, product_categoryname FROM productcategory where  product_categoryid NOT IN (SELECT product_categoryid from product where product_categoryid is not NULL  );


