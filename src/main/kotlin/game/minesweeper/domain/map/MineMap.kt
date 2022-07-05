package game.minesweeper.domain.map

class MineMap(private val _rows: List<Row>) {

    fun rows() = _rows

    fun setMines(coordinates: List<Coordinate>) = coordinates.groupBy { it.x }
        .forEach { _rows[it.key - 1].setMines(it.value) }

    companion object {
        private const val START_ROW_NUM = 1
        fun create(config: MapConfig) = MineMap(
            (START_ROW_NUM..config.height)
                .map { Row.from(it, config.width) }
        )
    }
}