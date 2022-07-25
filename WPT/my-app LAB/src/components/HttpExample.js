const HttpExample=()=>{
    const getData=()=>{
        const host = 'localhost:8080';
        fetch(`http://localhost:8080/product/getAll`)
        .then(resp => resp.json())
        .then((theGreatObject) => {
            console.log(theGreatObject);
            
        });

    }

    return <div>
        <button type="button" onClick={getData}>Get</button>
    </div>

}

export default HttpExample;