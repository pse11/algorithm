function solution(myString) {
   return myString.split("").map((v)=>{
       if(v==="a"){
           return "A";
       }else if(v==="A"){
           return "A";
       }else{
           return v.toLowerCase();
           
       }
   }).join("");
    
}