

drop PROCEDURE if EXISTS Display;
delimiter $
create procedure Display(in para_Message varchar(2000) )
BEGIN
select para_message as "Message Box";

end $
delimiter ;

/*
drop procedure if exists pro7;
delimiter $
create procedure pro7(in para_dname varchar(20))
begin
	declare flag bool default false;
	
	select distinct true into flag from duplicate where dname=para_dname;
	
	if flag then
		delete from duplicate where dname=para_dname;
		call Display("Record deleted");
	end if;
	
end $
delimiter ;
*/


/*
drop trigger if exists tr3;
delimiter $

create trigger tr3 before INSERT on dept for each row
begin
	declare x int default 0;
	select max(deptno) + 1 into x from dept;
	SET new.deptno := x;
	
end $
delimiter ;

*/

/*
drop procedure if exists pro8;
delimiter $
create procedure pro8()
begin
	declare exit handler for 1146 select 'Table not found';
	declare exit handler for 1146 select 'Duplicate Record';
	
	insert into dept values(1,10,10,10,10);
	select * from abc;
	select "hello";
end $
delimiter ;
*/`

/*
drop trigger if exists tr4;
delimiter $

create trigger tr4 before DELETE on dept for each row
begin
		insert into deptBK values(old.deptno, old.dname, old.loc, old.pwd, old.startedon, user(), curDate(), curtime());
	
end $

delimiter ;
*/


/*
drop trigger if exists tr5;
delimiter $

create trigger tr5 before INSERT on dept for each row
begin
	if new.deptno > 80 then
		signal sqlstate '42000' SET message_text= "Invalaid DEPTNO...!";
	end if;
end $

delimiter ;
*/
/*
mysql> insert into dept values(81,1,1,1,1);
*/

/*
drop trigger if exists tr4;
delimiter $

create trigger tr4 after DELETE on dept for each row
begin
		insert into deptBK values(old.deptno, old.dname, old.loc, old.pwd, old.startedon, user(), curDate(), curtime());
	
end $

delimiter ;

*/



/*

mysql> insert into dept values(2,'purchase','surat','c',10,7000);

*/

/*

drop trigger if exists tr5;
delimiter $

create trigger tr5 before INSERT on dept for each row
begin
	SET new.dname := upper(new.dname);
	SET new.loc := upper(new.loc);
	
end $

delimiter ;

*/

/*
drop trigger if exists tr6;
delimiter $

create trigger tr6 before INSERT on dept for each row
begin
	if new.amount < 10000 then
		SET new.amount := 10000;
	end if;
	
end $

delimiter ;

*/


/*

mysql> insert into dept values(3,'abcd','mumbai','c',10,7000);

*/
/*
drop procedure if exists pro9;
delimiter $
create procedure pro9()
begin
	declare _deptno int;
	declare _dname varchar(20);
	declare _loc varchar(20);
	declare _pwd varchar(20);
	declare _startedon varchar(20);
	declare _amount int;
	
	
	declare c1 cursor for select * from dept;
	
	declare exit handler for 1329 call display('No more records to fetch from the cursor!');
	
	open c1;
	lbl:loop
		fetch c1 into _deptno, _dname, _loc, _pwd, _startedon, _amount;
		
		select _deptno, _dname, _loc, _pwd, _startedon, _amount;
	
	end loop lbl;
	
	close c1;
	
end $
delimiter ;

*/
/*


drop procedure if exists pro10;
delimiter $
create procedure pro10()
begin
	declare _deptno int;
	declare _dname varchar(20);
	declare _loc varchar(20);
	declare _pwd varchar(20);
	declare _startedon varchar(20);
	declare _amount int;
	
	declare c1 cursor for select * from dept;
	
	declare exit handler for 1329 call display('No more records to fetch from the cursor!');
	
	open c1;
	lbl:loop
		fetch c1 into _deptno, _dname, _loc, _pwd, _startedon, _amount;
		
		if  _deptno <=30 then
			insert into d values ( _deptno, _dname, _loc, _pwd, _startedon, _amount);
		end if;
	end loop lbl;
	close c1;
	
end $
delimiter ;


*/


drop procedure if exists pro11;
delimiter $
create procedure pro11(in x int)
begin
	declare _deptno int;
	declare _dname varchar(20);
	declare _loc varchar(20);
	declare _pwd varchar(20);
	declare _startedon varchar(20);
	declare _amount int;
	declare x int default 1;
	
	declare c1 cursor for select * from dept;
	
	open c1;
	lbl:loop

		if x > 3 then
			leave lbl;
		end if;
		
		
		fetch c1 into _deptno, _dname, _loc, _pwd, _startedon, _amount;
		
		select _deptno, _dname, _loc, _pwd, _startedon, _amount;
		
		
		SET x := x + 1;
	
	end loop lbl;
	close c1;
	
end $
delimiter ;



















































