drop procedure if exists pro9;
delimiter $
create procedure pro9()
begin
	declare _deptno int;
	declare _dname varchar(20);
	declare _loc varchar(20);
	declare _pwd varchar(20);
	declare _startedon varchar(20);
	
	
	
	declare c1 cursor for select * from dept;
	
	declare exit handler for 1329 call display('No more records to fetch from the cursor!');
	
	open c1;
	lbl:loop
		fetch c1 into _deptno, _dname, _loc, _pwd, _startedon;
		
		select _deptno, _dname, _loc, _pwd, _startedon;
	
	end loop lbl;
	
	close c1;
	
end $
delimiter ;