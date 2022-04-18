// Do not change the code below.

data class Vector2(var x: Int, var y: Int)        

interface Moving {
    var currentCoordinates: Vector2

    var speed: Vector2

    var direction: Vector2

    fun move()
    fun slowDown(subtractedSpeed: Int)
    fun speedUp(addedSpeed: Int)
    fun rotate(newDirection: Vector2)
}

class yourMovingObject(override var currentCoordinates: Vector2,
                               override var speed: Vector2,
                               override var direction: Vector2) : Moving {
    override fun move() {
        currentCoordinates.x += speed.x * direction.x
        currentCoordinates.y += speed.y * direction.y
    }

    override fun slowDown(subtractedSpeed: Int) {
        speed.x -= subtractedSpeed
        speed.y -= subtractedSpeed
    }

    override fun speedUp(addedSpeed: Int) {
        speed.x += addedSpeed
        speed.y += addedSpeed
    }

    override fun rotate(newDirection: Vector2) {
        direction.x = newDirection.x
        direction.y = newDirection.y
    }
}
