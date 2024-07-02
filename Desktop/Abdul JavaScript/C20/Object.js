ArrayObject = [2,3,5,3,3,2,5];
let object = 0;
function objectDisplay(numbers){
    let object = {};
    for(let index = 0; index < numbers.length; index++) {
        let storeWord = numbers[index]; 

      B
        if(storeWord in object){
            object[storeWord]++
         }
         else {
            object[storeWord] = 1 
         }

   } 
  return object; 
}
 console.log( objectDisplay(ArrayObject))      

 module.exports = {objectDisplay};
   
         
        
         
