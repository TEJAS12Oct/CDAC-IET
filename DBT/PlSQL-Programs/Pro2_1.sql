drop procedure if exists pro2_1;
delimiter $
create procedure pro2_1(p1 int , p2 int)
begin
	select p1 + p2 as "Addition";
	select p1 + p2 as "Substraction";
        select p1 * p2 as "Multiplication";
	select p1 + p2 as "Division";
end $
delimiter ;