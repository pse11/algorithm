function solution(array) {
    const obj = {};
  array.forEach((element) => {
    obj[element] = obj[element] ? obj[element] + 1 : 1;
  });

  const result = Object.keys(obj).sort((a, b) => obj[b] - obj[a]);
  return obj[result[0]] === obj[result[1]] ? -1 : +result[0];
    
}