drop procedure if exists PrintEmp;
delimiter $
create procedure PrintEmp()
begin
	declare _empno int;
	declare _ename varchar(20);
	declare _gender char(1);
	declare _job varchar(20);
	declare _mgr int;
	declare _hiredate date;
	declare _sal int;
	declare _comm int;
	declare _deptno int;
	declare _bonusid int;
	declare _username varchar(30);
	declare _pwd varchar(30);
	declare _phone varchar(20);
	declare _isactive int(1);
	
	
	declare c1 cursor   for select * from emp;
	
	declare exit handler for 1329 select "NO MORE RECORD TO FETCH";
	
	open c1;
	
		lbl:loop
			fetch c1 into _empno, _ename,_gender, _job,_mgr,_hiredate,_sal ,_comm,_deptno,_bonusid,_username ,_pwd,_phone,_isactive ;
	
			select _empno ,_ename ,_gender , _job, _mgr ,_hiredate,_sal , _comm, _deptno,_bonusid, _username ,_pwd , _phone , _isactive ;
			
		end loop lbl;
	close c1;
end $
delimiter ;