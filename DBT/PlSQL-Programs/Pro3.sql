drop procedure if exists pro3;
delimiter $
create procedure pro3(in p1 int , in p2 int, out x int, out y int)
begin
	set x := p1 + p2;
	set y := p1 * p2;
end $
delimiter ;
