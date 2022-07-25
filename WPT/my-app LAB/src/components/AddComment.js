import React from "react";
import { useState } from "react";


const AddComment=(props)=>{
    const [newComment,setNewComment]=useState();
    const [newName,setNewname]=useState();
    // var comment=newComment;
    // comment.push("content");
    // setNewComment(comment);
    const setNewNameFunction=(event)=>{
        setNewname(event.target.value);
    }

    const setNewCommentFunction=(event)=>{
        setNewComment(event.target.value);
    }

    const addCommentFunction=()=>{
        console.log(newComment);
        console.log(newName);
        console.log(props);
        
        // {comment:'this is very complex',by:'preeti'}
        var newCommentObject={
            comment : newComment,
            by : newName
        }
        console.log(newCommentObject);
        props.add(newCommentObject);

    }

    return <div>
        <p>Enter comment : <input type="text" onChange={setNewCommentFunction}/></p>
        <p>Enter Name : <input type="text" onChange={setNewNameFunction}/></p>
        <p><button type="button" onClick={addCommentFunction}>Add Comment</button></p>

    </div>
}

export default AddComment;