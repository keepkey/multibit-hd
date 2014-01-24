package org.multibit.hd.ui.views.wizards.send_bitcoin;

import org.multibit.hd.ui.views.wizards.AbstractWizard;
import org.multibit.hd.ui.views.wizards.AbstractWizardPanelView;

import java.util.Map;


/**
 * <p>Wizard to provide the following to UI for "Send Bitcoin":</p>
 * <ol>
 * <li>Enter amount</li>
 * <li>Confirm details</li>
 * <li>Report progress</li>
 * </ol>
 *
 * @since 0.0.1
 *         
 */
public class SendBitcoinWizard extends AbstractWizard<SendBitcoinWizardModel> {

  public SendBitcoinWizard(SendBitcoinWizardModel model, boolean isExiting) {
    super(model, isExiting);
  }

  @Override
  protected void populateWizardViewMap(Map<String, AbstractWizardPanelView> wizardViewMap) {

    wizardViewMap.put(
      SendBitcoinState.ENTER_AMOUNT.name(),
      new SendBitcoinEnterAmountPanelView(this, SendBitcoinState.ENTER_AMOUNT.name()));
    wizardViewMap.put(
      SendBitcoinState.CONFIRM_AMOUNT.name(),
      new SendBitcoinConfirmPanelView(this, SendBitcoinState.CONFIRM_AMOUNT.name()));
    wizardViewMap.put(
      SendBitcoinState.SEND_BITCOIN_REPORT.name(),
      new SendBitcoinReportPanelView(this, SendBitcoinState.SEND_BITCOIN_REPORT.name()));

  }

}
