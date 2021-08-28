// ㅇㅅ 3

function solution(array) {
  const aggSum = [0];
  // 각 원소를 누적해서 더한 배열을 생성합니다.
  for (let i = 0; i < array.length; i++) {
    aggSum.push(aggSum[i] + array[i]);
  }

  let res = 0;
  // 투 포인터를 사용해 누적값을 더합니다.
  for (let end = 1; end < aggSum.length; end++) {
    for (let start = end; start < aggSum.length; start += 2) {
      res += aggSum[start] - aggSum[end - 1];
    }
  }
  return res;
}
