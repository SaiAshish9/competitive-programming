const recursiveSum = (
    candidates,
    remainingSum,
    finalCombinations = [],
    currentCombination = [],
    startFrom = 0,
 ) => {
    if (remainingSum < 0) {
       return finalCombinations;
    }
    if (remainingSum === 0) {
       finalCombinations.push(currentCombination.slice());
       return finalCombinations;
    }
    for (let candidateIndex = startFrom; candidateIndex < candidates.length; candidateIndex += 1) {
       const currentCandidate = candidates[candidateIndex];
       currentCombination.push(currentCandidate);
       recursiveSum(
          candidates,
          remainingSum - currentCandidate,
          finalCombinations,
          currentCombination,
          candidateIndex,
       );
       currentCombination.pop();
    }
    return finalCombinations;
 }
 const combinationSum = (candidates, target) => recursiveSum(candidates, target);
 
 console.log(combinationSum([2, 3, 6, 7], 7));