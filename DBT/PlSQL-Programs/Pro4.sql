drop procedure if exists pro4;
delimiter $
create procedure pro4(inout p1 int)
begin
	set p1 := p1 * 2;
	
end $
delimiter ;