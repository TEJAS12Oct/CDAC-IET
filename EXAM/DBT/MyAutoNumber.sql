drop procedure if exists Display;
delimiter $
create procedure Display(in para_Message varchar(2000))
begin
	 select para_Message as "Message Box" ;
end $
delimiter ;



drop function if exists MyAutoNumber;
delimiter $
create function MyAutoNumber() returns bigint
deterministic
begin 

   return (round(rand()*100));
/*   
   if (namefirst exits student && namelast exits Student)
      then
   call Display("Student exists");
*/
end $
delimiter ;