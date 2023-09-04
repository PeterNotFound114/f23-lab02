function circle(radius: number): Shape {
    return {
        getWidth: function (): number {
            return 2 * radius
        },
        getHeight: function (): number {
            return 2 * radius
        },
        computeArea: function (): number {
            return Math.PI * radius * radius
        }
    }
}

export { circle }
