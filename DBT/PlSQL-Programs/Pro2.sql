drop procedure if exists pro2;
delimiter $
create procedure pro2(p1 int , p2 int)
begin
	select p1 + p2 as "Message Box";
end $
delimiter ;