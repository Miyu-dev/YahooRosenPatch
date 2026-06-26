package androidx.compose.foundation.text;

import androidx.appcompat.R;
import androidx.compose.ui.input.key.Key;
import androidx.compose.ui.input.key.KeyEvent;
import androidx.compose.ui.input.key.KeyEvent_androidKt;
import kj.l;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.m;

/* JADX INFO: compiled from: KeyMapping.kt */
/* JADX INFO: loaded from: C:\ClaudeWork\YahoRsen\YahooRosenPatch\tmp\patching-1782388517898\patched\originalDex\classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001f\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0000ø\u0001\u0000\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"defaultKeyMapping", "Landroidx/compose/foundation/text/KeyMapping;", "getDefaultKeyMapping", "()Landroidx/compose/foundation/text/KeyMapping;", "commonKeyMapping", "shortcutModifier", "Lkotlin/Function1;", "Landroidx/compose/ui/input/key/KeyEvent;", "", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = R.styleable.AppCompatTheme_checkboxStyle)
public final class KeyMappingKt {
    private static final KeyMapping defaultKeyMapping;

    static {
        final KeyMapping keyMappingCommonKeyMapping = commonKeyMapping(new PropertyReference1Impl() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$1
            public Object get(Object obj) {
                return Boolean.valueOf(KeyEvent_androidKt.m4016isCtrlPressedZmokQxo(((KeyEvent) obj).m4001unboximpl()));
            }
        });
        defaultKeyMapping = new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt$defaultKeyMapping$2$1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo819mapZmokQxo(android.view.KeyEvent event) {
                m.h(event, "event");
                KeyCommand keyCommand = null;
                if (KeyEvent_androidKt.m4018isShiftPressedZmokQxo(event) && KeyEvent_androidKt.m4016isCtrlPressedZmokQxo(event)) {
                    long jM4012getKeyZmokQxo = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m843getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_LEFT_WORD;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m844getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_RIGHT_WORD;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m845getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_PREV_PARAGRAPH;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m842getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_NEXT_PARAGRAPH;
                    }
                } else if (KeyEvent_androidKt.m4016isCtrlPressedZmokQxo(event)) {
                    long jM4012getKeyZmokQxo2 = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m843getDirectionLeftEK5gGoQ())) {
                        keyCommand = KeyCommand.LEFT_WORD;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m844getDirectionRightEK5gGoQ())) {
                        keyCommand = KeyCommand.RIGHT_WORD;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m845getDirectionUpEK5gGoQ())) {
                        keyCommand = KeyCommand.PREV_PARAGRAPH;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m842getDirectionDownEK5gGoQ())) {
                        keyCommand = KeyCommand.NEXT_PARAGRAPH;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m847getHEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_CHAR;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m841getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_NEXT_WORD;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m837getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_PREV_WORD;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m836getBackslashEK5gGoQ())) {
                        keyCommand = KeyCommand.DESELECT;
                    }
                } else if (KeyEvent_androidKt.m4018isShiftPressedZmokQxo(event)) {
                    long jM4012getKeyZmokQxo3 = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                    MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m850getMoveHomeEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_HOME;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m849getMoveEndEK5gGoQ())) {
                        keyCommand = KeyCommand.SELECT_END;
                    }
                } else if (KeyEvent_androidKt.m4015isAltPressedZmokQxo(event)) {
                    long jM4012getKeyZmokQxo4 = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                    MappedKeys mappedKeys4 = MappedKeys.INSTANCE;
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo4, mappedKeys4.m837getBackspaceEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_FROM_LINE_START;
                    } else if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo4, mappedKeys4.m841getDeleteEK5gGoQ())) {
                        keyCommand = KeyCommand.DELETE_TO_LINE_END;
                    }
                }
                return keyCommand == null ? keyMappingCommonKeyMapping.mo819mapZmokQxo(event) : keyCommand;
            }
        };
    }

    public static final KeyMapping commonKeyMapping(final l<? super KeyEvent, Boolean> lVar) {
        m.h(lVar, "shortcutModifier");
        return new KeyMapping() { // from class: androidx.compose.foundation.text.KeyMappingKt.commonKeyMapping.1
            @Override // androidx.compose.foundation.text.KeyMapping
            /* JADX INFO: renamed from: map-ZmokQxo */
            public KeyCommand mo819mapZmokQxo(android.view.KeyEvent event) {
                m.h(event, "event");
                if (((Boolean) lVar.invoke(KeyEvent.m3995boximpl(event))).booleanValue() && KeyEvent_androidKt.m4018isShiftPressedZmokQxo(event)) {
                    if (Key.m3417equalsimpl0(KeyEvent_androidKt.m4012getKeyZmokQxo(event), MappedKeys.INSTANCE.m858getZEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    return null;
                }
                if (((Boolean) lVar.invoke(KeyEvent.m3995boximpl(event))).booleanValue()) {
                    long jM4012getKeyZmokQxo = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                    MappedKeys mappedKeys = MappedKeys.INSTANCE;
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m838getCEK5gGoQ()) ? true : Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m848getInsertEK5gGoQ())) {
                        return KeyCommand.COPY;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m855getVEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m856getXEK5gGoQ())) {
                        return KeyCommand.CUT;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m835getAEK5gGoQ())) {
                        return KeyCommand.SELECT_ALL;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m857getYEK5gGoQ())) {
                        return KeyCommand.REDO;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo, mappedKeys.m858getZEK5gGoQ())) {
                        return KeyCommand.UNDO;
                    }
                    return null;
                }
                if (KeyEvent_androidKt.m4016isCtrlPressedZmokQxo(event)) {
                    return null;
                }
                if (KeyEvent_androidKt.m4018isShiftPressedZmokQxo(event)) {
                    long jM4012getKeyZmokQxo2 = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                    MappedKeys mappedKeys2 = MappedKeys.INSTANCE;
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m843getDirectionLeftEK5gGoQ())) {
                        return KeyCommand.SELECT_LEFT_CHAR;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m844getDirectionRightEK5gGoQ())) {
                        return KeyCommand.SELECT_RIGHT_CHAR;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m845getDirectionUpEK5gGoQ())) {
                        return KeyCommand.SELECT_UP;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m842getDirectionDownEK5gGoQ())) {
                        return KeyCommand.SELECT_DOWN;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m852getPageUpEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_UP;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m851getPageDownEK5gGoQ())) {
                        return KeyCommand.SELECT_PAGE_DOWN;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m850getMoveHomeEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_START;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m849getMoveEndEK5gGoQ())) {
                        return KeyCommand.SELECT_LINE_END;
                    }
                    if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo2, mappedKeys2.m848getInsertEK5gGoQ())) {
                        return KeyCommand.PASTE;
                    }
                    return null;
                }
                long jM4012getKeyZmokQxo3 = KeyEvent_androidKt.m4012getKeyZmokQxo(event);
                MappedKeys mappedKeys3 = MappedKeys.INSTANCE;
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m843getDirectionLeftEK5gGoQ())) {
                    return KeyCommand.LEFT_CHAR;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m844getDirectionRightEK5gGoQ())) {
                    return KeyCommand.RIGHT_CHAR;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m845getDirectionUpEK5gGoQ())) {
                    return KeyCommand.UP;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m842getDirectionDownEK5gGoQ())) {
                    return KeyCommand.DOWN;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m852getPageUpEK5gGoQ())) {
                    return KeyCommand.PAGE_UP;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m851getPageDownEK5gGoQ())) {
                    return KeyCommand.PAGE_DOWN;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m850getMoveHomeEK5gGoQ())) {
                    return KeyCommand.LINE_START;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m849getMoveEndEK5gGoQ())) {
                    return KeyCommand.LINE_END;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m846getEnterEK5gGoQ())) {
                    return KeyCommand.NEW_LINE;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m837getBackspaceEK5gGoQ())) {
                    return KeyCommand.DELETE_PREV_CHAR;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m841getDeleteEK5gGoQ())) {
                    return KeyCommand.DELETE_NEXT_CHAR;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m853getPasteEK5gGoQ())) {
                    return KeyCommand.PASTE;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m840getCutEK5gGoQ())) {
                    return KeyCommand.CUT;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m839getCopyEK5gGoQ())) {
                    return KeyCommand.COPY;
                }
                if (Key.m3417equalsimpl0(jM4012getKeyZmokQxo3, mappedKeys3.m854getTabEK5gGoQ())) {
                    return KeyCommand.TAB;
                }
                return null;
            }
        };
    }

    public static final KeyMapping getDefaultKeyMapping() {
        return defaultKeyMapping;
    }
}
