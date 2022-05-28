/*
drop PROCEDURE if EXISTS Insert_login;
delimiter $
create procedure Insert_login(in para_username varchar(20) , in para_password varchar(20))
BEGIN
insert into login(username , password) values (para_username, para_password);
end $
delimiter ;
*/

/*
drop PROCEDURE if EXISTS Display_login;
delimiter $
create procedure Display_login()
BEGIN
  select * from login;
end $
delimiter ;
*/

/*
drop PROCEDURE if EXISTS Display;
delimiter $
create procedure Display(in para_Message varchar(2000) )
BEGIN
select para_message as "Message Box";

end $
delimiter ;
*/

/*
drop PROCEDURE if EXISTS login_Validation;
delimiter $
create procedure login_Validation(in para_username varchar(20) , in para_password varchar(20))
BEGIN
  declare flag bool default false;
  select true into flag from login where userName = para_username and PassWord = para_password;
  if flag  then  
  call Display("Valid Username");
  ELSE
   call Display("INvalid Username");
end if;
end $
delimiter ;
*/

/*
drop PROCEDURE if EXISTS Delete_Login;
delimiter $
create procedure Delete_Login(in para_username varchar(20))
BEGIN

  declare flag bool default false;
  select true into flag from login where userName = para_username;
  
  if flag  then  
  delete from  login where userName = para_username;
  call Display("User Deleted");
  ELSE
  call Display("User does not EXITS");
  end if;

end $
delimiter ;
*/

/*
drop  function  if exists f1;
delimiter $

create function f1() returns varchar(20)
deterministic 
BEGIN 
declare x VARCHAR(20);
select "Hello World" into x;
return (x);

end $
delimiter ;
*/

/*
drop  function  if exists f2;
delimiter $

create function f2(x int , y int) returns int
deterministic 
BEGIN 

   /* return (x + y); // 
return (ifnull(x,0) + ifnull(y,0));

end $
delimiter ;
*/

/*
drop  function  if exists f3;
delimiter $
create function f3() returns int
deterministic 

BEGIN 
  declare x  int;
  declare  cnt int;
  set x := 0;
  set cnt := 0;
  
  select count(*) into cnt from login2;
  if cnt = 0 
  THEN
  return (1);
  
  ELSE
  select max(id) + 1 into x from login2;
  return (x);

  end if;

end $
delimiter ;
*/

/*
drop procedure if exists pro5;
delimiter $
create procedure pro5()
begin
	declare x int default 1;
	loop_label:loop
		select x;
		SET x := x + 1;
		if x > 5 then
			leave loop_label;
		END IF;
		
	end loop loop_label;
end $
delimiter ;
*/

/*
drop procedure if exists pro6;
delimiter $
create procedure pro6()
begin
	create table a1(id int, ename varchar(20));
	
end $
delimiter ;

*/

/*
drop function if exists f4;
delimiter $

create function f4() returns varchar(20)	
deterministic
begin
	
	create table a2(id int, ename varchar(20));  // ERROR
	return("Table Created");
end $
delimiter ;




drop function if exists f5;
delimiter $
deterministic
create function f5() returns varchar(20)	
begin
	return("Table Created");     ERROR;
end $
delimiter ;

*/

/*

drop trigger if exists tr1;
delimiter $

create trigger tr1 before INSERT on dept for each row
begin
	insert into log(logData) values ('Record inserted in DEPT table!');
end $

delimiter ;
*/

drop trigger if exists tr2;
delimiter $

create trigger tr2 before INSERT on dept for each row
begin
	insert into deptBK values(new.deptno, new.dname, new.loc, new.pwd, new.startedon, user(), curtime() ,curDate() );
end $

delimiter ;









