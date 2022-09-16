## 733. Flood Fill

### Description

An image is represented by an m x n integer grid image where image[i][j] represents the pixel value of the image.

You are also given three integers sr, sc, and color. You should perform a flood fill on the image starting from the pixel image[sr][sc].

To perform a flood fill, consider the starting pixel, plus any pixels connected 4-directionally to the starting pixel of the same color as the starting pixel, plus any pixels connected 4-directionally to those pixels (also with the same color), and so on. Replace the color of all of the aforementioned pixels with color.

Return the modified image after performing the flood fill.

### Solution

```
func floodFill(image [][]int, sr int, sc int, color int) [][]int {
	oldColor := image[sr][sc]
	if oldColor == color {
		return image
	}

	positions := [][]int{{0, 1}, {0, -1}, {1, 0}, {-1, 0}}
	image[sr][sc] = color

	for i := 0; i < len(positions); i++ {
		nextX := sr + positions[i][0]
		nextY := sc + positions[i][1]

		if nextX < 0 || nextX >= len(image) || nextY < 0 || nextY >= len(image[0]) {
			continue
		}

		if image[nextX][nextY] != oldColor {
			continue
		}

		floodFill(image, nextX, nextY, color)
	}

	return image
}
```