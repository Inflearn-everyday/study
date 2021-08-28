// ㅇㅅ 5

function solution(heights, bricks, ladders) {
  const heightDiff = [];
  // 건물 간의 높이 차이를 저장하는 배열을 생성합니다.
  for (let i = 1; i < heights.length; i++) {
    const diff = heights[i] - heights[i - 1];
    if (diff > 0) heightDiff.push(diff);
    else heightDiff.push(0);
  }

  let i = 0;
  // 높이 차이가 가장 큰 순으로 사다리를 먼저 사용하고 나머지는 벽돌을 사용합니다.
  let sortedHeightDiff = [];
  for (i = 0; i < heightDiff.length; i++) {
    if (heightDiff[i] === 0) continue;

    sortedHeightDiff.push(heightDiff[i]);

    if (sortedHeightDiff.length <= ladders) continue;

    sortedHeightDiff.sort(compareNumbers);

    const needeBricks = sortedHeightDiff
      .slice(ladders, sortedHeightDiff.length)
      .reduce((augDiff, diff) => augDiff + diff, 0);
    if (needeBricks > bricks) return i;
  }

  return i;
}

// 내림차순 정렬
function compareNumbers(a, b) {
  return b - a;
}
