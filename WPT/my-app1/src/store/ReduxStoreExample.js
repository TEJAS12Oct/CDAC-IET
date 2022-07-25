import {createStore} from "redux"

const initialState={counter: 10 ,userName :'abcd'}

const exampleReducer=(state=initialState,action)=>{
    if(action.type === 'increase'){
        return {
            counter : state.counter +2,
            userName : state.userName
        }
    }
    else if(action.type === 'setUserName'){
        return {
            counter : state.counter,
            userName : action.value
        }
    }else if (action.type === 'decrease'){
        return {
            counter: state.counter -2,
            userName : state.userName
        }
    }
    else{
    return state;
    }

}

const store=createStore(exampleReducer);

export  default store;
