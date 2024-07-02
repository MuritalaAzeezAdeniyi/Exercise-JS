let listOfNumber = [95,78,85,60,45,92]
let result = listOfNumber.map((detail) => {
     if (detail <= 95 && detail >= 90){
         return "A"
      }
         if(detail <= 89 && detail >= 80){ 
      return "B"
      }
       if (detail <= 79 && detail >= 70){
        return "C"
      }
        if(detail <= 69 && detail >= 60 ){
        return  "D"
        }
        if(detail  <  60) {
        return "F"
        }
    })
console.log(result)