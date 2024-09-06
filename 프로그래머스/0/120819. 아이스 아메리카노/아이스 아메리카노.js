function solution(money) {
    const result = []
    result.push(Math.floor(money/5500))
    result.push(money%5500)
    return result
}