function square(sideLen: number): Shape {
    return {
        getWidth: function (): number {
            return sideLen
        },
        getHeight: function (): number {
            return sideLen
        },
        computeArea: function (): number {
            return sideLen * sideLen
        }
    }
}

export { square }