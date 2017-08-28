
package effect


import java.io.Serializable



/**
 * Maybe
 */
sealed class Maybe<A> : Serializable
{

    fun isJust() : Boolean = when (this)
    {
        is Just    -> true
        is Nothing -> false
    }


    infix fun <B> ap(f : (A) -> Maybe<B>) : Maybe<B> = when (this)
    {
        is Just   -> {
            val nextMaybe = f(this.value)
            when (nextMaybe) {
                is Just    -> Just(nextMaybe.value)
                is Nothing -> Nothing()
            }
        }
        is Nothing -> Nothing()
    }


    infix fun <B> apply(f : (A) -> Maybe<B>) : Maybe<B> = this.ap(f)



    fun toNullable() : A? = when(this)
    {
        is Just    -> this.value
        is Nothing -> null
    }

}


/**
 * Just
 */
data class Just<A>(val value : A) : Maybe<A>()


/**
 * Nothing
 */
class Nothing<A> : Maybe<A>()
{
    override fun equals(other : Any?) : Boolean
    {
        if (other is Nothing<*>)
            return true

        return false
    }

    override fun hashCode() : Int = 99999999

}


fun <A> lift(value : A?) : Maybe<A> =
        if (value != null)
            Just(value)
        else
            Nothing()




fun <A> List<Maybe<A>>.filterJust() : List<A>
{
    val justs : MutableList<A> = mutableListOf()

    this.forEach {
        when (it) {
            is Just -> justs.add(it.value)
        }
    }

    return justs
}
//        this.mapNotNull { elem ->
//            when (elem) {
//                is Just -> elem.value
//                is Nothing -> null
//            }
//        }
//{
