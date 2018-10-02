function getMaxSubset(array) {
	var curSum = 0;
	var prevMax = 0;
	var prevMaxLoc = -1;
	var prevMin = 0;
	var prevMinLoc = -1;
	var curMin = 0;
	var curMinLoc = -1;
	
	for (var i=0;i<array.length;i++) {
		curSum += array[i];
		if (curSum < curMin) {
			curMin = curSum;
			curMinLoc = i;
		}
		if (curSum - curMin > prevMax - prevMin) {
			prevMax = curSum;
			prevMaxLoc = i;
			prevMin = curMin;
			prevMinLoc = curMinLoc;
		}
	}
	
	return array.slice(prevMinLoc + 1, prevMaxLoc + 1);
}