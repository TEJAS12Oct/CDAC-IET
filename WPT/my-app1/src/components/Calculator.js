const Calculator=(props)=>{
    console.log(props)
    const arr=props.arr;
    const operation=props.op;
    let result;
    switch (operation){
        case "+":
            result=arr[0]+arr[1];
            break;
        case "-":
            result=arr[0]-arr[1];
            break;
        default:
            result=arr[0]*arr[1];
            break;
    }
    return <div>
        <p>Result is {result}</p>
    </div>
}

export default Calculator;