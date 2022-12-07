package com.example.layoutm7;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 7, 1},
        k = 1,
        d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"},
        d2 = {"Lcom/example/layoutm7/Titular;", "", "titulo", "", "subtitulo", "(Ljava/lang/String;Ljava/lang/String;)V", "getSubtitulo", "()Ljava/lang/String;", "getTitulo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Layout_M7.app.main"}
)
public final class Titular {
    @NotNull
    private final String titulo;
    @NotNull
    private final String subtitulo;

    @NotNull
    public final String getTitulo() {
        return this.titulo;
    }

    @NotNull
    public final String getSubtitulo() {
        return this.subtitulo;
    }

    public Titular(@NotNull String titulo, @NotNull String subtitulo) {
        super();
        Intrinsics.checkNotNullParameter(titulo, "titulo");
        Intrinsics.checkNotNullParameter(subtitulo, "subtitulo");
        this.titulo = titulo;
        this.subtitulo = subtitulo;
    }

    @NotNull
    public final String component1() {
        return this.titulo;
    }

    @NotNull
    public final String component2() {
        return this.subtitulo;
    }

    @NotNull
    public final Titular copy(@NotNull String titulo, @NotNull String subtitulo) {
        Intrinsics.checkNotNullParameter(titulo, "titulo");
        Intrinsics.checkNotNullParameter(subtitulo, "subtitulo");
        return new Titular(titulo, subtitulo);
    }

    // $FF: synthetic method
    public static Titular copy$default(Titular var0, String var1, String var2, int var3, Object var4) {
        if ((var3 & 1) != 0) {
            var1 = var0.titulo;
        }

        if ((var3 & 2) != 0) {
            var2 = var0.subtitulo;
        }

        return var0.copy(var1, var2);
    }

    @NotNull
    public String toString() {
        return "Titular(titulo=" + this.titulo + ", subtitulo=" + this.subtitulo + ")";
    }

    public int hashCode() {
        String var10000 = this.titulo;
        int var1 = (var10000 != null ? var10000.hashCode() : 0) * 31;
        String var10001 = this.subtitulo;
        return var1 + (var10001 != null ? var10001.hashCode() : 0);
    }

    public boolean equals(@Nullable Object var1) {
        if (this != var1) {
            if (var1 instanceof Titular) {
                Titular var2 = (Titular)var1;
                if (Intrinsics.areEqual(this.titulo, var2.titulo) && Intrinsics.areEqual(this.subtitulo, var2.subtitulo)) {
                    return true;
                }
            }

            return false;
        } else {
            return true;
        }
    }
}
