package club.sk1er.elementa.markdown.drawables

import club.sk1er.elementa.markdown.DrawState
import club.sk1er.elementa.markdown.MarkdownConfig
import club.sk1er.elementa.markdown.cursor.TextCursor

/**
 * A soft break is one line break between lines of markdown text.
 */
class SoftBreakDrawable(config: MarkdownConfig) : Drawable(config) {
    override fun layoutImpl(x: Float, y: Float, width: Float): Layout {
        TODO("Not yet implemented")
    }

    override fun draw(state: DrawState) {
        TODO("Not yet implemented")
    }

    override fun select(mouseX: Float, mouseY: Float): TextCursor {
        TODO("Not yet implemented")
    }

    override fun selectStart(): TextCursor {
        TODO("Not yet implemented")
    }

    override fun selectEnd(): TextCursor {
        TODO("Not yet implemented")
    }
}