function newRectangle(width: number, height: number): Shape {
    return {
        getWidth: function (): number {
            return width
        },
        getHeight: function (): number {
            return height
        },
        computeArea: function (): number {
            return width * height
        }
    }
}

export { newRectangle }
