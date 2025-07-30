const prompt = require('prompt-sync')()
const score1 = []
const score2 = []
const totalScore = []

// collecting Array and pushing to total Array

const collectArrrays = (arrayName,arraylenght,arraySet,totalArrys) =>{
for(let count = 0; count < arraylenght; count++){
arrayName[count] = Number(prompt(`Put the ${arraySet} set of numbers`)) 
totalArrys.push(arrayName[count])
}
console.log('Done Starting collecting Next Array')
}

collectArrrays(score1,5,1,totalScore)
collectArrrays(score2,6,2,totalScore)


totalScore.toSorted()
console.log(totalScore)
// for(let index = 0; index < totalScore.length; index++){
//	for(let counter = 1 ; counter < totalScore.length;counter++){

	//if(totalScore[index] > totalScore[counter]){
	// totalScore[index] = totalScore[counter]
	//totalScore[index] = totalScore[counter]	
//}
//}

//}

const calcMiddlePosition = Math.floor(totalScore.length / 2) 
const Oddpositon = calcMiddlePosition - 1
const median = totalScore.length % 2 == 0 ? (totalScore[Oddpositon] + totalScore[(Oddpositon + 1)])/2 : totalScore[calcMiddlePosition]
console.log(median)