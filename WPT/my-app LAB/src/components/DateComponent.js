const DateComponent=()=> {
    let dateOne="2022-02-04";
    var dateObject=new Date(dateOne);
    //MMMM
    const month=dateObject.toLocaleString('default',{month : 'short'})
    console.log(dateObject.getFullYear());

    return <div>
                <p>{month}</p>
            </div>

}

export default DateComponent;