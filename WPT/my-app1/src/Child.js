

export default function Child(props)
{
    let num=props.num;
    let f= props.tellme;
    f(num*num)

    return(
        <div>
            Square Of {num} Is {num*num} 

        </div>
    );
}