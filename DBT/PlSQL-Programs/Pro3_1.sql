drop procedure if exists pro3_1;
delimiter $
create procedure pro3_1(in p1 int , in p2 int, out a int, out b int , out c int , out d int)
begin
	set a := p1 + p2;
	set b := p1 - p2;
	set c := p1 * p2;
	set d := p1 / p2;
end $
delimiter ;