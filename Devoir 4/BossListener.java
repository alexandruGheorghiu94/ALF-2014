// Generated from Boss.g4 by ANTLR 4.2
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BossParser}.
 */
public interface BossListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BossParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(@NotNull BossParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link BossParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(@NotNull BossParser.RContext ctx);
}